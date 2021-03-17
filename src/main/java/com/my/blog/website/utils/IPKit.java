package com.my.blog.website.utils;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * ip工具类
 */
public class IPKit {
    /**
     * 获取ip地址
     * @param request   请求
     * @return          ip地址
     */
    public static String getIpAddrByRequest(HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    public static String getRealIp() throws SocketException{
        // 本地ip，如果没有配置外网ip则返回它
        String localIp = null;
        // 外网ip
        String netIp = null;

        Enumeration<NetworkInterface> netInterfaces = NetworkInterface.getNetworkInterfaces();
        InetAddress ip = null;
        // 是否找到外网ip
        boolean finded = false;
        while (netInterfaces.hasMoreElements() && !finded){
            NetworkInterface ni = netInterfaces.nextElement();
            Enumeration<InetAddress> address = ni.getInetAddresses();
            while (address.hasMoreElements()){
                ip = address.nextElement();
                // 外网地址
                if (!ip.isSiteLocalAddress() && !ip.isLoopbackAddress() && !ip.getHostAddress().contains(":")){
                    netIp = ip.getHostAddress();
                    finded = true;
                    break;
                    // 内网地址
                }else if (ip.isSiteLocalAddress() && !ip.isLoopbackAddress() && !ip.getHostAddress().contains(":")){
                    localIp = ip.getHostAddress();
                }
            }
        }
        if (netIp != null && !"".equals(netIp)){
            return netIp;
        }else {
            return localIp;
        }
    }
}

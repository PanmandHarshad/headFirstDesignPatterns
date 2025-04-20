package chapter11.proxy.protection;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private final Internet internet = new RealInternet();
    private static final List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("facebook.com");
        bannedSites.add("instagram.com");
        bannedSites.add("youtube.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied to " + serverHost);
        }
        internet.connectTo(serverHost);
    }
}

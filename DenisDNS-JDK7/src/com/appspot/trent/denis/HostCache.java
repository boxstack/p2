package com.appspot.trent.denis;

import java.util.ArrayList;

public class HostCache {
	public HostCache() {
		
	}
	
	HostRecord findHost(String domainName) {
		for (HostRecord r: items) {
			if (r.getDomainName().equals(domainName)) {
				return r;
			}
		}
		return null;
	}
	
	@SuppressWarnings("unused")
	void addHost(HostRecord r) {
		HostRecord orig = findHost(r.getDomainName());
		if (orig == null) {
			items.add(r);
		} else {
			if (true) return;
			// add ip addresses
			for (IPAddress address: r.getIpAddresses()) {
				orig.addIpAddress(address);
			}
		}
	}
	
	public ArrayList<HostRecord> getItems() {
		return items;
	}

	ArrayList<HostRecord>	items = new ArrayList<HostRecord>();
}

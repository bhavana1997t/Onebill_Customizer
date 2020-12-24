package com.onebill.customizer.service;

import java.util.List;

import com.onebill.customizer.entities.Bundel;
public interface BundelService {
	public Bundel addBundel(Bundel bundel);
	public Bundel removeBundel(int bundelId);
	public Bundel updateBundel(Bundel bundel);
	public List<Bundel> getAllBundel();
	List<Bundel> getBundel(String bundelName);
	public List<Bundel> getBundels(String bundelName);

}

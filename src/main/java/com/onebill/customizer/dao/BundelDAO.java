package com.onebill.customizer.dao;

import java.util.List;

import com.onebill.customizer.entities.Bundel;


public interface BundelDAO {
	public Bundel addBundel(Bundel bundel);
	public Bundel updateBundel(Bundel bundel);
	public List<Bundel> getAllBundel();
	public Bundel removeBundel(int bundelId);
	List<Bundel> getBundel(String bundelName);
	public List<Bundel> getBundels(String bundelName);
}

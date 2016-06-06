package com.zhbit.expresscompany.service;

import java.util.List;

import com.zhbit.expresscompany.domain.Banches;

public interface BanchesSerive {
	Banches add(Banches banches);
	void removeBanches(int bid);
	Banches getBanches(int bid);
	List<Banches> getALlBanches();
	void upDate(Banches banches);
        List<Banches> allNotUseBanches(List list);     
	List<Banches> getBanchesByPidCid(int pid,int cid);
}

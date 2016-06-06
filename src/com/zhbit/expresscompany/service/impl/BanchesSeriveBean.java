package com.zhbit.expresscompany.service.impl;

import java.util.List;

import com.zhbit.expresscompany.dao.BanchesDao;
import com.zhbit.expresscompany.domain.Banches;
import com.zhbit.expresscompany.domain.Notice;
import com.zhbit.expresscompany.service.BanchesSerive;



public class BanchesSeriveBean implements BanchesSerive{
  
	   private BanchesDao banchesDao;
	
	   public Banches add(Banches banches){
		   return banchesDao.save(banches);
	   }
	   
	   public void removeBanches(int bid){
		   Banches banches = banchesDao.getBanchesById(bid);
		   banchesDao.delete(banches);
	   }
	   public Banches getBanches(int bid){
		   return banchesDao.getBanchesById(bid);
	   }
       public  List<Banches> getALlBanches(){
    	   return banchesDao.query();
       }
       
       public void upDate(Banches banches){
    	   banchesDao.update(banches);
       }
       

        public List<Banches> allNotUseBanches(List list){
    	   return banchesDao.notUseBanches(list);
       }

	public BanchesDao getBanchesDao() {
		return banchesDao;
	}

	public void setBanchesDao(BanchesDao banchesDao) {
		this.banchesDao = banchesDao;
	}

	public List<Banches> getBanchesByPidCid(int pid, int cid) {
		
		return banchesDao.getBanchesByPidCid(pid, cid);
	}
	   
}

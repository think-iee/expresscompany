package com.zhbit.expresscompany.dao;
import com.zhbit.expresscompany.domain.Banches;
import java.util.List;
public interface BanchesDao {
	Banches save(Banches banches);
	Banches update(Banches banches);
	void delete(Banches banches);
	Banches getBanchesById(int bid);
	List<Banches> query();
        List<Banches> notUseBanches(List list);
	List<Banches> getBanchesByPidCid(int pid,int cid);
}

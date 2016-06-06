package com.zhbit.expresscompany.dao;
import java.util.List;
import com.zhbit.expresscompany.domain.Staff;

public interface StaffDao {
	Staff save(Staff staff);
	void delect(Staff staff);
	Staff getStaffBySid(int sid);
        List<Staff> getStaffByStid(int stid);
}

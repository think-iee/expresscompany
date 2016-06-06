package com.zhbit.expresscompany.web.action;
import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.expresscompany.domain.Banches;
import com.zhbit.expresscompany.domain.SType;
import com.zhbit.expresscompany.domain.Staff;
import com.zhbit.expresscompany.service.BanchesSerive;
import com.zhbit.expresscompany.service.STypeSerive;
import com.zhbit.expresscompany.service.StaffSerive;

public class StaffAction extends ActionSupport {
	private StaffSerive serive;
	private Staff staff;
	private List<Staff> allStaffBid;

        private SType sType;
        private STypeSerive serive1;
        private List<SType> allStype;
	  
        private Banches banches;
	private BanchesSerive serive2;
	private List<Banches> allbanches;

	public String get(){
		Staff rightstaff;
		rightstaff=serive.getStaff(staff.getSid());
		if(rightstaff.getSpd().equals(staff.getSpd())){
			return "LoginStaff";
		}else{
			return SUCCESS;
		}
		
	}
	 
        public String add(){
		
		return "success";
	}
	
	public String enterWebsite(){
		System.out.println("nihaonihasjsadhfodshffadssafddsafdsaf");
		//获取网点经理ID并通过网点经理ID查找职工表里面所有网点经理
		allStaffBid=serive.getTheStaffByStid(serive1.getTheSTypeBySTypeName().getStid());
		System.out.println("CHENG"+serive1.getTheSTypeBySTypeName().getStid());
		//获取职工表里面所有已经分配网点经理的网点ID
		 List list=new ArrayList();
		for(int i=0;i<allStaffBid.size();i++){
			list.add(allStaffBid.get(i).getBid());
			System.out.println("chulaile "+allStaffBid.get(i).getSname());
		}
		System.out.println("ooooooooooooooooooooo"+list.get(0));
		System.out.println("ooooooooooooooooooooo"+list.get(1));
		//查找出所有还没分配网点经理的网点
		allbanches=serive2.allNotUseBanches(list);
		for(int i=0;i<allbanches.size();i++){
		System.out.println("出来网点"+allbanches.get(i).getBname());
		}
		return "enterWebsite";
	}

	public StaffSerive getSerive() {
		return serive;
	}
	public void setSerive(StaffSerive serive) {
		this.serive = serive;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public List<Staff> getAllStaffBid() {
		return allStaffBid;
	}

	public void setAllStaffBid(List<Staff> allStaffBid) {
		this.allStaffBid = allStaffBid;
	}

	public SType getsType() {
		return sType;
	}

	public void setsType(SType sType) {
		this.sType = sType;
	}

        public STypeSerive getSerive1() {
		return serive1;
	}

	public void setSerive1(STypeSerive serive1) {
		this.serive1 = serive1;
	}

	public List<SType> getAllStype() {
		return allStype;
	}

	public void setAllStype(List<SType> allStype) {
		this.allStype = allStype;
	}

	public Banches getBanches() {
		return banches;
	}

	public void setBanches(Banches banches) {
		this.banches = banches;
	}

	public BanchesSerive getSerive2() {
		return serive2;
	}

	public void setSerive2(BanchesSerive serive2) {
		this.serive2 = serive2;
	}

	public List<Banches> getAllbanches() {
		return allbanches;
	}

	public void setAllbanches(List<Banches> allbanches) {
		this.allbanches = allbanches;
	}
	
	
}

package com.zhbit.expresscompany.dao;
import com.zhbit.expresscompany.domain.*;

import java.util.List;
public interface OStateDao {
	OState save(OState ostate);
	OState update(OState ostate);
	void delete(OState ostate);
	OState getOStateById(int osid);
}

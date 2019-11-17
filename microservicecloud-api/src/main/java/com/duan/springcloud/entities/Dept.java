package com.duan.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
/**
 * 为什么在使用lombok框架的时候，在另外的module之中使用该类的时候，启动项目的时候，就报错
 * @author DXuan
 *
 */
public class Dept implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long deptno;
	//部门名称
	private String dname;
	//来自哪个数据库。因为微服务架构一个服务可以对应一个数据库，同一个信息可以被存储到不同的数据库
	private String db_source;
	public Dept() {
		// TODO Auto-generated constructor stub
	}
	public Dept(Long deptno, String dname, String db_source) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.db_source = db_source;
	}
	public Long getDeptno() {
		return deptno;
	}
	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDb_source() {
		return db_source;
	}
	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", db_source=" + db_source + "]";
	}
	
}

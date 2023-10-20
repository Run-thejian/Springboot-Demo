package com.zhong.dao;

import com.zhong.pojo.Department;
import com.zhong.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：zhongjianyi
 * @description：TODO
 * @date ：2023-10-20 14:54
 */

//员工Dao
@Repository
public class EmployeeDao {
    //模拟数据库中的数据
    private static Map<Integer, Employee> employees = null;
    //员工有所属的部门
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>();//创建一个部门表

        employees.put(1001,new Employee(1001,"AA","A157@qq.com",0,new Department(1001,"教学部")));
        employees.put(1002,new Employee(1002,"BB","B157@qq.com",1,new Department(1002,"市场部")));
        employees.put(1003,new Employee(1003,"CC","C157@qq.com",0,new Department(1003,"教研部")));
        employees.put(1004,new Employee(1004,"DD","D157@qq.com",1,new Department(1004,"运营部")));
        employees.put(1005,new Employee(1005,"EE","E157@qq.com",0,new Department(1005,"后勤部")));

    }

    //主键自增
    private static Integer initId = 1006;
    //增加一个员工
    public void save(Employee employee){
        if (employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));

        employees.put(employee.getId(),employee);
    }

    //查询员工全部信息
    public Collection<Employee> getAll(){
        return employees.values();
    }

    //通过id查询员工
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    //删除员工通过id
    public void delete(Integer id){
        employees.remove(id);
    }
}

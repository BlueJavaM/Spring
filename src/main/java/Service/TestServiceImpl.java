package Service;

/*
 *@Author: XieLiang
 *@Date : 2018/6/29
 *@Comment :
 */

import DAO.TestDAO;

public class TestServiceImpl implements TestService {

    private TestDAO TestDAO;

    public TestServiceImpl() {
    }

    //构造注入
    public TestServiceImpl(TestDAO TestDAO) {
        this.TestDAO = TestDAO;
    }


    //设值注入
    public DAO.TestDAO getTestDAO() {
        return TestDAO;
    }

    public void setTestDAO(DAO.TestDAO testDAO) {
        TestDAO = testDAO;
    }

    @Override
    public void save(String date) {

        System.out.println("需要操作的数据:" +date);
        date = date + this.getClass();
        TestDAO.save(date);
    }
}

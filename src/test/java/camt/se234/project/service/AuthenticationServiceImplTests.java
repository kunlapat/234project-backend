package camt.se234.project.service;

import camt.se234.project.dao.UserDao;
import camt.se234.project.dao.UserDaoImpl;
import camt.se234.project.entity.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AuthenticationServiceImplTests {

    UserDao userDao;
    AuthenticationServiceImpl userService;


    @Before
    public void setup(){
        userDao = mock(UserDao.class);
        userService = new AuthenticationServiceImpl();
        userService.setUserDao(userDao);
    }

    @Test
    public void testAuthentication(){
        when(userDao.getUser("mock01","aa")).thenReturn(new User(null,"mock01","aa","admin"));
        when(userDao.getUser("mock02","bb")).thenReturn(new User(null,"mock02","bb","user"));
        when(userDao.getUser("mock03","cc")).thenReturn(new User(null,"mock03","cc","user"));
        when(userDao.getUser("mock04","dd")).thenReturn(new User(null,"mock04","dd","user"));

        assertThat(userDao.getUser("mock01","aa"),is(new User(null,"mock01","aa","admin")));
        assertThat(userDao.getUser("mock02","bb"),is(new User(null,"mock02","bb","user")));
        assertThat(userDao.getUser("mock03","cc"),is(new User(null,"mock03","cc","user")));
        assertThat(userDao.getUser("mock04","dd"),is(new User(null,"mock04","dd","user")));

    }



}

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
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.doReturn;
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
        List<User> mockUsers = new ArrayList<>();
        mockUsers.add(new User(1,"mock01","aa","admin"));
        mockUsers.add(new User(2,"mock02","bb","user"));
        mockUsers.add(new User(3,"mock03","cc","user"));
        when(userDao.getUser(String )).thenReturn(mockUsers);

        assertThat(userService.authenticate("mock01","aa"),is(new User(1,"mock01","aa","admin")));


    }



}

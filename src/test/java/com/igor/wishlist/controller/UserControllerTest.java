package com.igor.wishlist.controller;

import com.igor.wishlist.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Autowired
    private UserController controller;
    @MockBean
    private MockMvc mockMvc;
    @Mock
    public UserService userService;

    @BeforeEach
    public void before() {
        userService = Mockito.mock(UserService.class);
    }
//    @Test
//    public void testControllerForUserGetById() throws Exception {
//        UserResponse value = new UserResponse();
//        value.setId(1l);
//        value.setName("test");
//
//        when(userService.findUserById(Mockito.anyLong())).thenReturn(value);
//
//        mockMvc.perform(
//                get("/api/user/{id}", 1)
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isOk());
//
//
//    }

}
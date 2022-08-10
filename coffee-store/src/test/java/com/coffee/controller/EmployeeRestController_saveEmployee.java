package com.coffee.controller;

import com.coffee.dto.EmployeeDTO;
import com.coffee.model.account.AppUser;
import com.coffee.model.employee.Position;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeRestController_saveEmployee {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test userName = null
     */
    @Test
    public void saveEmployee_userName_13() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName(null);

        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress("Tp.Đà NẴNG");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana@gmail.com");
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test userName = ""
     */
    @Test
    public void saveEmployee_userName_14() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("");

        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress("Tp.Đà NẴNG");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana@gmail.com");
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test userName: first input = number
     */
    @Test
    public void saveEmployee_userName_15() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("1user123");

        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress("Tp.Đà NẴNG");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana@gmail.com");
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test userName < 6 char
     */
    @Test
    public void saveEmployee_userName_16() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("user1");

        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress("Tp.Đà NẴNG");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana@gmail.com");
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test name = null
     */
    @Test
    public void saveEmployee_name_13() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("user123");

        employeeDTO.setName(null);
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress("Tp.Đà NẴNG");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana@gmail.com");
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test name = ""
     */
    @Test
    public void saveEmployee_name_14() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();
        AppUser appUser = new AppUser();
        appUser.setUserName("user123");
        employeeDTO.setName("");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress("Tp.Đà NẴNG");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana@gmail.com");
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test format birthday
     */
    @Test
    public void saveEmployee_birthday_15() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("user123");

        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("20000101");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress("Tp.Đà NẴNG");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana@gmail.com");
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test phoneNumber = null
     */
    @Test
    public void saveEmployee_phoneNumber_13() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("user123");

        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber(null);
        employeeDTO.setAddress("Tp.Đà NẴNG");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana@gmail.com");
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test phoneNumber = ""
     */
    @Test
    public void saveEmployee_phoneNumber_14() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("user123");

        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("");
        employeeDTO.setAddress("Tp.Đà NẴNG");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana@gmail.com");
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test address = null
     */
    @Test
    public void saveEmployee_address_13() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("user123");
        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress(null);
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana@gmail.com");
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test address = ""
     */
    @Test
    public void saveEmployee_address_14() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("user123");
        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress("");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana@gmail.com");
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test email = null
     */
    @Test
    public void saveEmployee_email_13() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("user123");
        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress("Tp.Đà Nẵng");
        employeeDTO.setGender(0);
        employeeDTO.setEmail(null);
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test name = ""
     */
    @Test
    public void saveEmployee_email_14() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("user123");

        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress("Tp.Đà Nẵng");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("");
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test format email
     */
    @Test
    public void saveEmployee_email_15() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("user123");

        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress("Tp.Đà Nẵng");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana");
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test salary = null
     */
    @Test
    public void saveEmployee_salary_13() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("user123");

        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress("Tp.Đà Nẵng");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana@gmail.com");
        employeeDTO.setSalary(null);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test salary < 0
     */
    @Test
    public void saveEmployee_salary_15() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("user123");

        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress("Tp.Đà Nẵng");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana@gmail.com");
        employeeDTO.setSalary(-11.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Create by TaiLV
     * create date:10/08/2022
     * method : saveEmployee()
     * test employee create success
     */
    @Test
    public void saveEmployee_18() throws Exception {

        EmployeeDTO employeeDTO = new EmployeeDTO();

        AppUser appUser = new AppUser();
        appUser.setUserName("user1231212");

        employeeDTO.setName("Lê Văn A");
        employeeDTO.setBirthday("2000-01-01");
        employeeDTO.setPhoneNumber("0936369999");
        employeeDTO.setAddress("Tp.Đà NẴNG");
        employeeDTO.setGender(0);
        employeeDTO.setEmail("levana@gmail.com");
        employeeDTO.setSalary(1000000.0);
        employeeDTO.setImage("http/:firebase.levana.png");
        employeeDTO.setIsDeleted(0);

        Position position = new Position();
        position.setId(1);
        employeeDTO.setPosition(position);

        this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/rest/employee/create")
                        .content(this.objectMapper.writeValueAsString(employeeDTO))
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().is2xxSuccessful());
    }
}
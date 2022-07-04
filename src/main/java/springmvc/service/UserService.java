package springmvc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		return userDao.saveUser(user);
	}
}

/*
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context" xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context 
    http://www.springframework.org/schema/context/spring-context.xsd">

	<context:component-scan base-package="springmvc.controller" />

	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/views/"></property>
		<property name="suffix" value=".jsp"></property>
	</bean>

	<bean class="org.springframework.jdbc.datasource.DriverManagerDataSource" name="ds">
        <property name="driverClass" value="com.mysql.jdbc.Driver" />
        <property name="jdbcUrl" value="jdbc:mysql://localhost:3306/learning" />
        <property name="user" value="root" />
        <property name="password" value="root" />
    </bean>
    
	<bean class="org.springframework.orm.hibernate5.LocalSessionFactoryBean" name="factory">
		<property name="datasource" ref="ds"></property>
		<property name="hibernateProperties">
			<props>
				<prop key="hibernate.dialect">org.hibernate.dialect.MySQLDialect</prop>
                <prop key="hibernate.show_sql">true</prop>
                <prop key="hibernate.hbm2ddl.auto">update</prop>
			</props>
		</property>
	</bean>
	

	<bean class="org.springframework.orm.hibernate5.HibernateTemplate" name="hibernateTemplate">
		<property name="sessionFactory" ref="factory"></property>
	</bean>

</beans>
 */
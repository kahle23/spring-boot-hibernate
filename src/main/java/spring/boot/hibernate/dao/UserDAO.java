package spring.boot.hibernate.dao;

import spring.boot.hibernate.pojo.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name="tbb_user")
@Qualifier("userDAO")
public interface UserDAO extends JpaRepository<User, Long> {

}

package com.onlyjavatech.springbootproject.jpa.dao;

import com.onlyjavatech.springbootproject.jpa.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {
    //Derived Query Methods/Custom Finder Methods
    //select * from user where name="something";
    public List<User> findByName(String name);
    public List<User> findByNameAndCity(String name,String city);

    /*
    * findByNameStartingWith(String prefix)
    * findByNameEndingWith(String suffix)
    * findByNameContaining(String words)
    * findByNameLike(String likePattern)
    * findByAgeLessThan(int age)
    * findByAgeGreaterThanEqual(int age)
    * findByAgeIn(Collection<Integer> ages)
    * findByNameOrderByName(String name)  */

    //when your project need complex queries then you need to insert query here
    // Query can be embedded here in two format ex- JPQL query or use native query

    //Using JAVA Persistance Query Language Query
    @Query("select u from User u")
    public List<User> getAllUser();
    @Query("select  u from User u WHERE u.name=:n and u.city=:c")
    public List<User> getUserByName(@Param("n")String name,@Param("c") String city);

    //Using Native Query
    @Query(value="select * from user",nativeQuery = true)
    public List<User> getUsers();

}



## ------------------------- Query using named parameters
	@Query("select u from User u where u.firstname = :firstname or u.lastname = :lastname")
	User findByLastnameOrFirstname(@Param("lastname") String lastname, @Param("firstname") String firstname);



## ------------------------- NamedQuery using HQL 
	@Entity
	@NamedQuery(name = "Author.findByFirstName", query = "FROM Author WHERE firstName = ?1")
	@NamedQuery(name = "Author.findByFirstNameAndLastName", query = "SELECT a FROM Author a WHERE a.firstName = ?1 AND a.lastName = ?2")
	public class Author { ... }


## -------------------------- NamedQuery using nativeSQL
	@Entity
	@NamedNativeQuery(name = "Author.findByFirstName", query = "SELECT * FROM author WHERE first_name = ?", resultClass = Author.class)
	@NamedNativeQuery(name = "Author.findByFirstNameAndLastName", query = "SELECT * FROM author WHERE first_name = ? AND last_name = ?", resultClass = Author.class)
	public class Author { ... }


## -------------------------- Sorting for JPA Provided and Derived Methods
	userRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
	userRepository.findAll(Sort.by("LENGTH(name)"));



## --------------------------- JQP Query ---->  NativeQuery
@Query("SELECT u FROM User u WHERE u.status = ?1")
User findUserByStatus(Integer status);

@Query(value = "SELECT * FROM Users u WHERE u.status = ?1", nativeQuery = true)
User findUserByStatusNative(Integer status);




## ---------------------------- Using Collection Parameter
Consider the case when the where clause of our JPQL or SQL query contains the IN (or NOT IN) keyword:   SELECT u FROM User u WHERE u.name IN :names
@Query(value = "SELECT u FROM User u WHERE u.name IN :names")
List<User> findUserByNameList(@Param("names") Collection<String> names);


## ------------------------------ UPDATE using Query
@Modifying
@Query("update User u set u.status = :status where u.name = :name")
int updateUserSetStatusForName(@Param("status") Integer status, @Param("name") String name);


## ------------------------------ INSERT using Query
@Modifying
@Query(value = "insert into Users (name, age, email, status) values (:name, :age, :email, :status)", nativeQuery = true)
void insertUser(@Param("name") String name, @Param("age") Integer age, @Param("status") Integer status, @Param("email") String email);


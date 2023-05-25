# Data Operations with Spring Data

## Task

Implement data operations using Spring Data JPA for a simple blog application. The application should allow users to create, retrieve, update, and delete blog posts.

Your task is to complete the implementation of the `PostService` class, which will handle the data operations for the blog posts. THe blog posts table will also need to be created in an AWS RDS and connected to the Spring Boot Application. Implement the following methods:

- `createPost(Post post)`: Save a new blog post to the database.
- `getPostById(Long id)`: Retrieve a blog post by its ID.
- `getAllPosts()`: Retrieve all blog posts.
- `updatePost(Post post)`: Update an existing blog post.
- `deletePost(Long id)`: Delete a blog post by its ID.

## Starter Code

### `Post` Entity Class

```java
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String content;

    // Constructors, getters, setters, toString

}
```

### `PostRepository` Interface

```java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // Custom query methods can be added here if needed
}
```

### `PostService` Class

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post createPost(Post post) {
        // TODO: Implement the logic to save a new blog post
    }

    public Optional<Post> getPostById(Long id) {
        // TODO: Implement the logic to retrieve a blog post by its ID
    }

    public List<Post> getAllPosts() {
        // TODO: Implement the logic to retrieve all blog posts
    }

    public Post updatePost(Post post) {
        // TODO: Implement the logic to update an existing blog post
    }

    public void deletePost(Long id) {
        // TODO: Implement the logic to delete a blog post by its ID
    }
}
```

Feel free to add any additional methods or customize the code as per you application requirements.

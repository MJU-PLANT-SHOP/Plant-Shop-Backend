package plantshop.backend.domain.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import plantshop.backend.domain.post.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
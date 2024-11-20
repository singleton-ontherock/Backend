package ontherock.sender.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NotificationRepository extends MongoRepository<Notification, String> {
    List<Notification> findByUserIdOrderByCreatedAtDesc(Long userId);
    void deleteAllByUserId(Long userId);
}

package ZCW.ChatApp.repositories;
import ZCW.ChatApp.models.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {

    // TODO: Get Channels By User id
    Optional<Channel> findChannelByChannelName(String channelName);

}

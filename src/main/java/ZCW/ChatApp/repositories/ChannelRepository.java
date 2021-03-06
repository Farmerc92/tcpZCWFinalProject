package ZCW.ChatApp.repositories;
import ZCW.ChatApp.models.Channel;
import ZCW.ChatApp.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {

    // TODO: Get Channels By User id
    Optional<Channel> findChannelByChannelName(String channelName);

}

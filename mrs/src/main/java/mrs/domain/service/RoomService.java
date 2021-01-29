package mrs.domain.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mrs.domain.repository.ReservableRoomRepository;

@Service
@Transactional
public class RoomService {

	@Autowired
	ReservableRoomRepository reservableRoomRepository;

}

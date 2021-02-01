package mrs.domain.service;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mrs.domain.model.ReservableRoom;
import mrs.domain.repository.ReservableRoomRepository;

@Service
@Transactional //各メゾットが自動でトランザクション管理される
public class RoomService {

	@Autowired
	ReservableRoomRepository reservableRoomRepository;

	public List<ReservableRoom> findReservableRooms(LocalDate date) {
		return reservableRoomRepository.findByReservableRoomId_reservedDateOrderByReservableRoomId_roomIdAsc(date);
	}
}

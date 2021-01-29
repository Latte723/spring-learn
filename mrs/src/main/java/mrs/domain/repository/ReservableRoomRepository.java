package mrs.domain.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mrs.domain.model.ReservableRoom;
import mrs.domain.model.ReservableRoomId;

/**
 * 予約可能会議室リポジトリ
 * @author natsu
 *
 */
public interface ReservableRoomRepository extends JpaRepository<ReservableRoom, ReservableRoomId> {
	/**
	 * 予約日による予約可能会議室の検索
	 * （会議室IDで昇順に並び替え）
	 * @param reservedDate 予約日
	 * @return 予約可能会議室のレコードリスト
	 */
	List<ReservableRoom> findByReservableRoomId_reservedDateOrderByReservableRoomId_roomIdAsc(LocalDate reservedDate);
}

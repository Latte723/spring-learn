package mrs.domain.model;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 * 予約エンティティ
 * @author natsu
 *
 */
@Entity
public class Reservation implements Serializable {

	/** 予約ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reservationId;

	/** 開始時間 */
	private LocalTime startTime;

	/** 終了時間 */
	private LocalTime endTime;

	/** 予約会議室 */
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "resered_date"),
			@JoinColumn(name = "room_id") })
	private ReservableRoom reservableRoom;

	/** ユーザー */
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	/**
	 * 予約IDの取得
	 * @return reservationId 予約ID
	 */
	public Integer getReservationId() {
		return reservationId;
	}

	/**
	 * 予約IDの設定
	 * @param reservationId 予約ID
	 */
	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}

	/**
	 * 開始時間の取得
	 * @return startTime 開始時間
	 */
	public LocalTime getStartTime() {
		return startTime;
	}

	/**
	 * 開始時間の設定
	 * @param startTime 開始時間
	 */
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	/**
	 * 終了時間の取得
	 * @return endTime 終了時間
	 */
	public LocalTime getEndTime() {
		return endTime;
	}

	/**
	 * 終了時間の設定
	 * @param endTime 終了時間
	 */
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	/**
	 * 予約可能会議室の取得
	 * @return reservableRoom 予約可能会議室
	 */
	public ReservableRoom getReservableRoom() {
		return reservableRoom;
	}

	/**
	 * 予約可能会議室の設定
	 * @param reservableRoom 予約可能会議室
	 */
	public void setReservableRoom(ReservableRoom reservableRoom) {
		this.reservableRoom = reservableRoom;
	}

	/**
	 * ユーザーの取得
	 * @return user ユーザー
	 */
	public User getUser() {
		return user;
	}

	/**
	 * ユーザーの設定
	 * @param user ユーザー
	 */
	public void setUser(User user) {
		this.user = user;
	}

}

package mrs.domain.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

/**
 * 予約可能会議室エンティティ
 * @author natsu
 *
 */
@Entity
public class ReservableRoom implements Serializable {
	/** 予約可能会議室ID */
	@EmbeddedId
	private ReservableRoomId reserableRoomId;

	/** 会議室 */
	@ManyToOne
	@JoinColumn(name = "room_id", insertable = false, updatable = false)
	@MapsId("roomId")
	private MeetingRoom meetingRoom;

	/**
	 * 予約可能会議室エンティティ
	 * @param reservableRoomId 予約可能会議室ID
	 */
	public ReservableRoom(ReservableRoomId reservableRoomId) {
		this.reserableRoomId = reservableRoomId;
	}

	/**
	 * 予約可能会議室エンティティ
	 */
	public ReservableRoom() {
	}

	/**
	 * 予約可能会議室IDの取得
	 * @return reserableRoomId 予約可能会議室ID
	 */
	public ReservableRoomId getReserableRoomId() {
		return reserableRoomId;
	}

	/**
	 * 予約可能会議室IDの設定
	 * @param reserableRoomId 予約可能会議室ID
	 */
	public void setReserableRoomId(ReservableRoomId reserableRoomId) {
		this.reserableRoomId = reserableRoomId;
	}

	/**
	 * 会議室の取得
	 * @return meetingRoom 会議室
	 */
	public MeetingRoom getMeetingRoom() {
		return meetingRoom;
	}

	/**
	 * 会議室の設定
	 * @param meetingRoom 会議室
	 */
	public void setMeetingRoom(MeetingRoom meetingRoom) {
		this.meetingRoom = meetingRoom;
	}

}

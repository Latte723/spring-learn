package mrs.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 会議室エンティティ
 * @author natsu
 *
 */
@Entity
public class MeetingRoom implements Serializable {

	/** 会議室ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //値の自動生成(生成方法：一意)
	private Integer roomId;

	/** 会議室名 */
	private String roomName;

	/**
	 * 会議室IDの取得
	 * @return roomId 会議室ID
	 */
	public Integer getRoomId() {
		return roomId;
	}

	/**
	 * 会議室IDの設定
	 * @param roomId 会議室ID
	 */
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	/**
	 * 会議室名の取得
	 * @return roomName 会議室名
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * 会議室名の設定
	 * @param roomName 会議室名
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}



}

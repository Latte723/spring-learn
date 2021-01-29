package mrs.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ユーザーエンティティ
 * @author natsu
 */
@Entity
@Table(name = "usr")
public class User implements Serializable {

	/** ユーザーID */
	@Id
	private String userId;

	/** パスワード */
	private String password;

	/** 苗字 */
	private String firstName;

	/** 名前 */
	private String lastName;

	/** 役職 */
	@Enumerated(EnumType.STRING) //Enum(String型)のみ格納可能に設定
	private RoleName roleName;

	/**
	 * ユーザーIDの取得
	 * @return userId ユーザーID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDの設定
	 * @param userId ユーザーID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * パスワードの取得
	 * @return password パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードの設定
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 苗字の取得
	 * @return firstName 苗字
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 苗字の設定
	 * @param firstName 苗字
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 名前の取得
	 * @return lastName 名前
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 名前の設定
	 * @param lastName 名前
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 役職の取得
	 * @return roleName 役職
	 */
	public RoleName getRoleName() {
		return roleName;
	}

	/**
	 * 役職の設定
	 * @param roleName 役職
	 */
	public void setRoleName(RoleName roleName) {
		this.roleName = roleName;
	}

}

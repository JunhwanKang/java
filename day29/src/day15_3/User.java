package day15_3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private String username;
	private String password;
	private String address;
	@Override
	public boolean equals(Object obj) {		
		if(obj instanceof User==false)
			return false;
		User user = (User)obj;
		if(this.username.equals(user.username))
//		if(this.username == user.username && this.password == user.password && this.address == user.address)
			return true;
		return false;
	}
}

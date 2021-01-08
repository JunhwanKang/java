package day15_4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

// 쇼핑몰 회원
// Java Reflection
@Data // 게터 + 세터 + toString;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain=true)
public class User {
	private String username;
	private String password;
	private String irum;
	private String email;
	private String profileSajin;
	//기본값
	@Builder.Default
	private int buyCount = 0;
	@Builder.Default
	private int totalPurchaseAmount = 0;
	@Builder.Default
	private int loginFailureCnt = 0;
	@Builder.Default
	private boolean enabled = false;
	
}

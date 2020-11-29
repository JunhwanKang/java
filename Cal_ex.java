import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Cal_ex {
	public static void main(String[] args) {
//		생성하면 기본적으로 현재 날짜와 시간으로 설정됨.
		Calendar today = Calendar.getInstance();
		
//		get메서드가 아닌 set메서드로 지정해 줄 수 있다.
		System.out.println("이 해의 년도 : "+ today.get(Calendar.YEAR));
		System.out.println("월 (0~11, 0:1월): "+today.get(Calendar.MONTH)); //0이 1월을 뜻하므로 결과 값에 +1을 해줘야함.
		System.out.println("이 해의 몇 째 주(현재까지 주): "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주: "+today.get(Calendar.WEEK_OF_MONTH));
		
		//DATE와 DAY_OF_MONTH는 같다.
		System.out.println("이 달의 몇 일: "+ today.get(Calendar.DATE)); 
		System.out.println("이 달의 몇 일: "+ today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일: "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1:일요일): "+today.get(Calendar.DAY_OF_WEEK));  //1: 일요일 , 2: 월요일, ... 7:토요일
		System.out.println("이 달의 몇 째 요일: "+ today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전_오후 (0:오전, 1:오후) "+today.get(Calendar.AM_PM));
		
		//시간관련
		System.out.println("시간(0~11): "+ today.get(Calendar.HOUR));
		System.out.println("시간(0~23): "+ today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59): "+today.get(Calendar.MINUTE));
		System.out.println("초(0~59): "+today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999): "+today.get(Calendar.MILLISECOND));
		
		//천 분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다 ( 1 시간 = 60 * 60초)  한국은 GMT보다 +9시간 (9시간 빠르다)
		System.out.println("TimeZone(-12~+12): "+ (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		
		System.out.println("이 달의 마지막 날: "+ today.getActualMaximum(Calendar.DATE)); // 이 달의 마지막 일을 찾는다.
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		
		TimeZone tz = TimeZone.getTimeZone("America/New_York"); 

		    String time = sdf.format(today.getTime());
		    System.out.println(time);
		    Calendar us = Calendar.getInstance(tz);

		    us.setTimeZone(tz);
		    time = sdf.format(us.getTime());
		    System.out.println(time);
		

	}
}

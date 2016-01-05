/**
 * Created by Ha on 16. 1. 5..
 */

/*
    page 216 - 문자열 조합
    문자열에 있는 문자들의 모든 가능한 조합을 출력하는 함수를 구현하라.
    조합의 길이는 1이상이고 문자열 길이 이하이다. 문자의 배치 순서만 다를 뿐 같은 문자들이 들어가 있는
    조합은 같은 조합으로 간주한다. 즉, "123"이라는 문자열이 입력됐을 때 "12"와 "31"은 서로 다른
    조합이지만 "21"은 "12"와 같다.
 */

public class Combination {
    private StringBuilder out = new StringBuilder();
    private final String in; // 입력

    // 생성자로 입력 문자열 초기화
    public Combination(final String str) {
        in = str;
    }

    // 재귀 wrapper 함수
    public void combine(){
        combine(0);
    }

    // 실제 재귀 함수
    private void combine(int start){
        for(int i = start; i < in.length(); i++){
            out.append(in.charAt(i)); // 문자 추가
            System.out.println(out); // 출력 후
            combine(i + 1); // 하위 조합 수행
            out.setLength(out.length() - 1); // 완료 후 추가 한 문자 삭제
        }
    }
}

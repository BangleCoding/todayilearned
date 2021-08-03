클래스란 인스턴스를 만들어내는 공장과도 같다.

클래스 상속 
class 상속받을 클래스명(상속할 클래스명)

```python

#클래스 선언 
class HousePark:
    lastname = "박"
    def __init__(self, name):
        self.fullname = self.lastname + name
    def travel(self, where):
        print("%s, %s여행을 가다." %(self.fullname, where))

pey = HousePark("응용")
pey.travel("부산")

#상속 
class HouseKim(HousePark):
    lastname = "김"
juliet = HouseKim("줄리엣")
juliet.travel("독도")

```

class Car:
    speed = 0

    def acceleration(self):
        if Car.speed > 0:
            print("车加速了")
            Car.speed += 1
        else:
            print("车还没启动呢")

    def deceleration(self):
        if Car.speed > 0:
            print("车减速了")
            Car.speed -= 1
        else:
            print("车已经处于停止状态")

    def start(self):
        if Car.speed == 0:
            print("车启动了")
            Car.speed = 1
        else:
            print("请勿重复打火")
        def reverse():   
                print("此功能不能用")

class Teslah(Car):

    def acceleration(self):
        print("车加速了")
        self.speed += 3

        def deceleration(self):
            if Car.speed > 0:
                print("车减速了")
                self.speed -= 3
            elif Car.speed<0:
                print("车减速了")
                self.speed += 3
            else:
                print("车已经处于停止状态")

        def reverse(self):
            print("倒车模式")
            self.speed -= 3


c = Teslah()
c.acceleration()
print(c.speed)
        
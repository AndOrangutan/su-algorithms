class HelloWorld:
    def hello(self):
        return "Hello World"

    def hello_world(self):
        print(self.hello()+"!")


def test_hello():
    hllwrld = HelloWorld()
    assert hllwrld.hello() == "Hello World", "Incorrect text"

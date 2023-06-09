package intro

import "testing"


func TestHello(t *testing.T) {
    result := Hello()
    expected := "Hello World"

    if result != expected {
        t.Errorf("Hello() FAILED. Expected %s, got %s\n", expected, result)
    } else {
        t.Logf("Hello() PASSED. Expected %s, got %s\n", expected, result)
    }
}

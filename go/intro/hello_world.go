package intro

import "fmt"

func Hello() string {
    return "Hello World"
}

func HelloWorld() {
    fmt.Printf("%s%s", Hello(), "!")
}

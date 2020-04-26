package main
import "fmt"
func main(){
	var t  int = 0x7fffffffffffffff
	fmt.Println(t)
	t += 1
	fmt.Println(t)
	t += 1
	fmt.Println(t)
}

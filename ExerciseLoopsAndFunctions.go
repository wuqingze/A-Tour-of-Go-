package main

import (
	"fmt"
	"math"
)

func Sqrt(x float64) float64 {
	var low float64 = 0
	var hight float64 = x
	var mid float64 = (hight+low)/2
	var precise float64 = 0.1
	for math.Abs(mid*mid-x)>precise{
		if mid*mid > precise{
			hight = mid
		}else{
			low = mid
		}
	}
	mid = (hight+low)/2
	return mid
}

func main() {
	fmt.Println(Sqrt(2))
}


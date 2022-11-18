package main

import "fmt"

func findMinAndMax(measure []int) (result int) {
	min := measure[0]
	max := measure[0]

	for _, value := range measure {
		if value < min {
			min = value
		}

		if value > max {
			max = value
		}
	}

	return min * max
}

func main() {
	var measureCount int
	fmt.Scanln(&measureCount)
	measure := make([]int, int(measureCount))

	for i := 0; i < len(measure); i++ {
		fmt.Scan(&measure[i])
	}

	fmt.Println(findMinAndMax(measure))
}

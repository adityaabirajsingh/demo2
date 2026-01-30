nums = [2, 4, 7, 10, 15, 20]
print("Example array:",nums)
a=int(input("Enter number to search in the example array : "))
print("position is",binary_search(nums, a)+1) 

def binary_search(arr, target):
    left, right = 0, len(arr) - 1
    
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1

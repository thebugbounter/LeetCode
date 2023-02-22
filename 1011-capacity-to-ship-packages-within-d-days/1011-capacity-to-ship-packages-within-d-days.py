class Solution:
    def shipWithinDays(self, weights: List[int], D: int) -> int:
        lo = 0
        hi = 0

        def canShip(opacity):
            days = 1
            remain = opacity
            for weight in weights:
                if weight > opacity:
                    return False
                remain -= weight
                if remain < 0:
                    days += 1
                    remain = opacity - weight
            return days <= D

        for weight in weights:
            hi += weight
        while lo < hi:
            mid = (lo + hi) // 2
            if canShip(mid):
                hi = mid
            else:
                lo = mid + 1

        return lo
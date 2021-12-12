class MyStack:

    def __init__(self):
        self.stack = []

    def push(self, x: int) -> None:
        self.stack.append(x)

    def pop(self) -> int:
        return self.stack.pop(-1)

    def top(self) -> int:
        return self.stack[-1]

    def empty(self) -> bool:
        return not self.stack

- `Object` is the root class (inherited automatically).
- `Vehicle` defines common methods.
- Subclasses (`Car`, `Boat`, `Ferry`, `SuperFerry`) inherit and override methods as needed.

---

## 🚗 Vehicle (Base Class)
The `Vehicle` class contains common behavior shared by all subclasses.

### Methods defined:
- `draw()`
- `erase()`
- `setVisible(boolean)`
- `move(int, int)`
- `setSize(int, int)`
- `setColor(Color)`

These methods are **inherited** by all subclasses.

---

## 🚙 Car & 🚤 Boat
- Both extend `Vehicle`
- They **inherit all methods**
- Some methods like `draw()` or `erase()` are **overridden** to provide specific behavior

Example:
```java
@Override
void draw() {
    System.out.println("Draw Car");
}

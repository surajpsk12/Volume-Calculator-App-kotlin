# 📐 VolumeCalculatorApp

> **An Android application designed to calculate the volume of various 3D geometric shapes like Spheres, Prisms, Cylinders, and Cubes. Features a user-friendly interface with a custom adapter for shape selection.**

---
---
App link : https://drive.google.com/file/d/1omuz4NXb144upTSMum4n_eqSuxw6_EOW/view?usp=sharing
---



## 🚀 Features

- 💧 **Volume Calculations:**
    -   Sphere
    -   Prism
    -   Cylinder
    -   Cube
- 
📄 **Shape Selection:** Uses a custom adapter (`MyCustomAdapter.kt`) to display a list/grid of shapes.
- 📱 **Dedicated Input Screens:** Separate activities for each shape to input dimensions (e.g., radius, height, side length, base area).
- ✨ **Clean UI:** Styled with custom drawables and themes (`colors.xml`, `styles.xml`, `accent_divider.xml`, `grid_item_background.xml`, `button_primary.xml`).
- 🧱 **Object-Oriented Design:** Likely uses a `Shape.kt` class/interface as a base for different shapes.

---

## 🛠️ Tech Stack

- **Language:** Kotlin
- **UI:** XML
- **Core Components:** Android SDK (Activities, Adapters, `Drawable` resources, `View` components)

---

## 📁 Project Structure (Simplified)




```
com.surajvanshsv.volumecalculatorapp/   
├── MyCustomAdapter.kt          # Adapter for displaying shapes
├── Shape.kt                    # Base model for shapes
├── SphereActivity.kt           # Activity for Sphere volume calculation
├── PrismActivity.kt            # Activity for Prism volume calculation
├── CylinderActivity.kt         # Activity for Cylinder volume calculation
├── CubeActivity.kt             # Activity for Cube volume calculation (Please verify name)
├── MainActivity.kt             # (Or your main entry point Activity)
├── res/
│   ├── layout/                 # Activity layouts and item layouts for the adapter
│   ├── drawable/               # Custom drawables for UI styling
│   └── values/                 # colors.xml, strings.xml, styles.xml
└── AndroidManifest.xml


```





---

## ⚙️ Installation & Run

1.  **Clone this repo:**
    


```
git clone https://github.com/surajpsk12/Volume-Calculator-App-kotlin.git
    cd Volume-Calculator-App-kotlin
```




2.  **Open in Android Studio.**

3.  **Run the app on an emulator or physical device.**

---

## ✨ Future Enhancements

*   ✅ Add more shapes (e.g., Cone, Pyramid).
*   ✅ Include formulas and diagrams for each shape.
*   ✅ Save calculation history.
*   ✅ Unit tests for calculation logic.
*   ✅ Improved UI/UX with animations.

---

## 🤝 Contribution

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change or improve.

---

## 📜 License

MIT © 2024 [Suraj Kumar](https://github.com/surajpsk12)

---

## 🌐 Connect With Me

*   🔗 [LinkedIn - Suraj Kumar](https://www.linkedin.com/in/surajvansh12/)
*   💻 [GitHub - surajpsk12](https://github.com/surajpsk12)

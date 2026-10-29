# KaatibDocsPro

KaatibDocsPro is a unified Android document platform that combines a modern Arabic-first user experience with enterprise-style document processing.

## 📱 تحميل التطبيق كملف APK للهاتف عبر GitHub
تم تجهيز ملف التطبيق الموقع والجاهز للتثبيت مباشرة داخل المستودع، بالإضافة إلى النشر التلقائي عبر **GitHub Actions**:

1. **التحميل المباشر الفوري من ملفات المستودع (الأسرع — لا يحتاج انتظار البناء):**
   - ادخل إلى مجلد **`apk/`** في المستودع واختر ملف **`KaatibDocsPro.apk`**:
     [`https://github.com/malkbaty7-sketch/Onerevers-/raw/main/apk/KaatibDocsPro.apk`](https://github.com/malkbaty7-sketch/Onerevers-/raw/main/apk/KaatibDocsPro.apk)
   - أو افتح الملف من داخل المستودع واضغط على زر **Download raw file** لتحميله وتثبيته مباشرة على هاتفك.
2. **من قسم الإصدارات (Releases):**
   - افتح رابط الإصدارات في المستودع من متصفح هاتفك:
     [`https://github.com/malkbaty7-sketch/Onerevers-/releases`](https://github.com/malkbaty7-sketch/Onerevers-/releases)
   - اضغط على **`KaatibDocsPro.apk`** تحت قسم **Assets**.
3. **من تبويب GitHub Actions:**
   - ادخل إلى تبويب **Actions** في GitHub، ثم اختر أحدث عملية (**Build & Release Android APK**) وحمّل **`KaatibDocsPro-APK`** من قسم **Artifacts**.

## Included capabilities
- PDF file listing and browsing
- PDF tools section (merge, split, compress, scan, manage)
- Document preview and metadata screen
- Text extraction flow using Apache Tika
- PDF-to-Word conversion flow using a backend service
- Local document history with Room
- Persistent settings with DataStore
- Compose-based navigation and UI structure
- Backend service stubs for real API integration

## Source project mapping
- Kaatib: app shell, UX, home experience
- ClearPDF: PDF features, document toolkit patterns
- Apache Tika: extraction and metadata reading
- pdf2word: conversion flow and backend design

## Current implementation status
The repository now contains the following core building blocks:
- Android application shell
- Jetpack Compose screen flow
- Home dashboard
- Document list and file selection flow
- PDF tools route
- Viewer and extraction screens
- Conversion screen
- Settings screen
- DataStore settings management
- Room database foundation
- Retrofit and Moshi API scaffolding
- Backend service prototypes for Tika and PDF to Word
- Architecture and roadmap documentation

## App structure
```text
app/
├── src/main/java/com/kaatibdocspro/
│   ├── AppNavHost.kt
│   ├── MainActivity.kt
│   ├── KaatibDocsProApplication.kt
│   ├── data/
│   ├── network/
│   └── ui/
├── src/main/res/values/
├── build.gradle.kts
└── src/main/AndroidManifest.xml
```

## Android startup
1. Open the repository in Android Studio.
2. Use JDK 17.
3. Let Gradle sync.
4. Run the app module on a device or emulator.

## Backend startup
### Tika service
```bash
cd backend/tika-service
python -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
uvicorn main:app --reload --host 0.0.0.0 --port 8001
```

### PDF-to-Word service
```bash
cd backend/pdf2word-service
python -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
uvicorn main:app --reload --host 0.0.0.0 --port 8002
```

## Production roadmap
- Real PDF engine integration
- Real file picker and permission handling
- Real Tika API integration
- Real conversion job logic
- Better Arabic localization and UI polish
- Secure upload/download workflow
- Final deployment and testing

## Repository
https://github.com/malkbaty7-sketch/Onerevers-

# KaatibDocsPro Tika service

This service demonstrates a backend extraction layer for the Android app.

## Setup
```bash
python -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
uvicorn main:app --reload --host 0.0.0.0 --port 8001
```

## Endpoint
- POST /extract

## Response
```json
{
  "text": "Extracted text from the file...",
  "metadata": {
    "filename": "example.pdf",
    "size_bytes": "12345",
    "service": "tika"
  }
}
```

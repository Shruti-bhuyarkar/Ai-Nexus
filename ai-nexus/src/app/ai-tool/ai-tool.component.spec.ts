import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AiToolComponent } from './ai-tool.component';

describe('AiToolComponent', () => {
  let component: AiToolComponent;
  let fixture: ComponentFixture<AiToolComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AiToolComponent]
    });
    fixture = TestBed.createComponent(AiToolComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

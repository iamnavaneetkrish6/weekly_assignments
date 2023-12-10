import { TestBed } from '@angular/core/testing';

import { CricketServiceService } from './cricket-service.service';

describe('CricketServiceService', () => {
  let service: CricketServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CricketServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
